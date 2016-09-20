(ns guess.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 :from
 (fn [db]
   (:from db)))

(re-frame/reg-sub
 :to
 (fn [db]
   (:to db)))

(re-frame/reg-sub
 :guess
 (fn [db]
   (:guess db)))
