(ns guess.views
    (:require [re-frame.core :as re-frame]))

(defn main-panel []
  (let [from (re-frame/subscribe [:from])
  	to (re-frame/subscribe [:to])
  	guess (re-frame/subscribe [:guess])]
    (fn []
      [:div 
      	[:div "From:" @from]
      	[:div "To:" @to]
      	[:div "Guess:" @guess]
      	[:button {:on-click #(re-frame/dispatch [:less])} "Less?"]
      	[:button {:on-click #(re-frame/dispatch [:more])} "More?"]
      	[:button {:on-click #(re-frame/dispatch [:initialize-db])} "Right!"]
      ])))
