(ns grails)

(def tag-freqs (ref {}))

(defn swap-keys-merge-vals [m merge-f]
  (loop [new-m (empty m) m m]
    (if (empty? m)
      new-m
      (let [[k v] (first m)]
        (recur (into new-m {v (if (contains? new-m v) (merge-f (new-m v) k) k)}) (next m))))))

(defn n-most-popular-tags [n]
  (dosync (take n (reverse (sort (swap-keys-merge-vals @tag-freqs #(str %1 "," %2)))))))

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