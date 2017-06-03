(ns orcpub.route-map
  (:require [bidi.bidi :as bidi]))

(def dnd-e5-char-builder-route :char-builder-5e)
(def dnd-e5-char-list-route :char-list-5e)
(def dnd-e5-char-route :char-5e)
(def dnd-e5-char-page-route :char-5e-page)
(def dnd-e5-char-list-page-route :char-list-5e-page)
(def default-route :default)
(def register-route :register)
(def register-page-route :register-page)
(def verify-route :verify)
(def verify-failed-route :verify-failed)
(def verify-success-route :verify-success)
(def re-verify-route :re-verify)
(def verify-sent-route :verify-sent)
(def login-route :login)
(def login-page-route :login-page)
(def character-pdf-route :character-pdf)
(def check-email-route :check-email)
(def check-username-route :check-username)
(def reset-password-page-route :reset-password-page)
(def reset-password-route :reset-password)
(def send-password-reset-route :send-password-reset)
(def send-password-reset-page-route :send-password-reset-page)
(def password-reset-sent-route :password-reset-sent)
(def password-reset-success-route :password-reset-success)
(def password-reset-expired-route :password-reset-expired)
(def password-reset-used-route :password-reset-used)
(def terms-of-use-route :terms-of-use)
(def privacy-policy-route :privacy-policy)
(def community-guidelines-route :community-guidelines)
(def cookies-policy-route :cookies-policy)

(def routes ["/" {"" default-route
                  "verify" verify-route
                  "verification-expired" verify-failed-route
                  "verification-successful" verify-success-route
                  "verification-sent" verify-sent-route
                  "re-verify" re-verify-route
                  "register" register-route
                  "login" login-route
                  
                  "character.pdf" character-pdf-route
                  "check-email" check-email-route
                  "check-username" check-username-route

                  "reset-password" reset-password-route
                  "send-password-reset" send-password-reset-route
                  "password-reset-sent" password-reset-sent-route
                  "password-reset-success" password-reset-success-route
                  "password-reset-expired" password-reset-expired-route
                  "password-reset-used" password-reset-used-route
                  "terms-of-use" terms-of-use-route
                  "privacy-policy" privacy-policy-route
                  "community-guidelines" community-guidelines-route
                  "cookies-policy" cookies-policy-route
                  "dnd/"
                  {"5e/" {"characters" {"" dnd-e5-char-list-route
                                        ["/" :id] dnd-e5-char-route}}}
                  "pages/" {"register-page" register-page-route
                            "login-page" login-page-route
                            "reset-password-page" reset-password-page-route
                            "send-password-reset-page" send-password-reset-page-route
                            "dnd/"
                            {"5e/"
                             {"character-builder" dnd-e5-char-builder-route
                              "characters" {"" dnd-e5-char-list-page-route
                                            ["/" :id] dnd-e5-char-page-route}}}}}])

(defn path-for [& args]
  (apply bidi/path-for routes args))

(defn match-route [path]
  (->> path (bidi/match-route routes)))