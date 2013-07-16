(ns cuma.extension.misaki.markdown.custom)

(defn substring [s start & [end]]
  (if (nil? end)
    (.substring s start)
    (.substring s start end)))

(defn lastindexof [s ss]
  (.lastIndexOf s ss))

(defn until-last-slash [data url]
  (substring url 0
             (lastindexof url "/")))