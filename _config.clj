{
 ;; directory setting
 ;;   defailed information: http://liquidz.github.io/misaki/toc/02-directory-structure.html
 :public-dir   "public/"
 :template-dir "template/"
 :post-dir     "posts/"
 :layout-dir   "layouts/"
 :post-filename-regexp #"(\d{4})-(\d{1,2})-(\d{1,2})[-_](.+)\."
 :post-filename-format "$(filename)/index.html"
 :compile-with-post []
 :url-base "/"
 :posts-per-page nil

 :site {:site-title "misaki markdown"
        :atom       "atom.xml"
        :atom-base  "http://localhost:8080"
        :twitter-id "uochan"

        :local {:css ["css/main.css"]
                :js  ["js/highlight.pack.js"
                      "js/main.js"]}
        :remote {:css ["http://fonts.googleapis.com/css?family=Josefin+Sans"
                       "http://yandex.st/highlightjs/7.3/styles/github.min.css"]}}

 ;; misaki-markdown configuration
 ;; code regexp setting
 ;;   default value: #"(?s)```([^\r\n]*)[\r\n]+(.+?)[\r\n]+```"
 :code-regexp #"(?s)```([^\r\n]*)[\r\n]+(.+?)[\r\n]+```"

 ;; code html format setting
 ;;   defailt value; "<pre><code@(if lang) class="brush: $(lang);"@(end)>$(code)</code></pre>"
 :code-html-format "<pre><code@(if lang) class=\"brush: $(lang);\"@(end)>$(code)</code></pre>"

 :cuma {:extension "extension.clj"}
 
 :compiler "markdown"
 }

