(ns grails)

(import '(polyglot Note))

(defn create-sample-note []
  (let [note (Note.)]
    (doto note
      (.setContent "Sample note created from Clojure code")
      (.save {"flush" true, "failOnError" true}))))

