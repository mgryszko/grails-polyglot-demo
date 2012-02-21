(ns grails)

(def tag-freqs (ref {}))

(defn join [sep coll]
  (->> coll (interpose sep) (apply str)))

(defn n-most-popular-tags [n]
  (->> @tag-freqs
       (sort-by second) (partition-by second) reverse
       (map (fn [[[_ freq] :as coll]]
              [freq (join "," (map first coll))]))
       (take n)))

(defn split-tags [tags]
  (.split tags ","))

(defn inc-freq [freqs tag]
  (assoc freqs tag (inc (get freqs tag 0))))

(def inc-freqs
  (fn [freqs tags]
    (if (empty? tags)
      freqs
      (recur (inc-freq freqs (first tags)) (next tags)))))

(defn note-tagged [tags]
  (dosync (alter tag-freqs inc-freqs (split-tags tags))))