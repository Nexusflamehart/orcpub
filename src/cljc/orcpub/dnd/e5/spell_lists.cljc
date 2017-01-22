(ns orcpub.dnd.e5.spell-lists)

(def spell-lists
  {:bard
 {0
  #{:dancing-lights :light :mage-hand :mending :message :minor-illusion
    :prestidigitation :true-strike},
  1
  #{:bane :charm-person :comprehend-languages :cure-wounds
    :detect-magic :disguise-self :faerie-fire :feather-fall
    :healing-word :heroism :hideous-laughter :identify :illusory-script
    :longstrider :silent-image :sleep :speak-with-animals :thunderwave
    :unseen-servant},
  2
  #{:animal-messenger :blindness-deafness :calm-emotions
    :detect-thoughts :enhance-ability :enthrall :heat-metal
    :hold-person :invisibility :knock :lesser-restoration
    :locate-animals-or-plants :locate-object :magic-mouth
    :see-invisibility :shatter :silence :suggestion :zone-of-truth},
  3
  #{:bestow-curse :clairvoyance :dispel-magic :fear :glyph-of-warding
    :hypnotic-pattern :major-image :nondetection :plant-growth :sending
    :speak-with-dead :speak-with-plants :stinking-cloud :tiny-hut
    :tongues},
  4
  #{:confusion :dimension-door :freedom-of-movement
    :greater-invisibility :hallucinatory-terrain :locate-creature
    :polymorph},
  5
  #{:animate-objects :awaken :dominate-person :dream :geas
    :greater-restoration :hold-monster :legend-lore :mass-cure-wounds
    :mislead :modify-memory :planar-binding :raise-dead :scrying
    :seeming :teleportation-circle},
  6
  #{:eyebite :find-the-path :guards-and-wards :irresistible-dance
    :mass-suggestion :programmed-illusion :true-seeing},
  7
  #{:arcane-sword :etherealness :forcecage :magnificent-mansion
    :mirage-arcane :project-image :regenerate :resurrection :symbol
    :teleport},
  8
  #{:dominate-monster :feeblemind :glibness :mind-blank
    :power-word-stun},
  9 #{:foresight :power-word-kill :true-polymorph}},
 :cleric
 {0
  #{:guidance :light :mending :resistance :sacred-flame :thaumaturgy},
  1
  #{:bane :bless :command :create-or-destroy-water :cure-wounds
    :detect-evil-and-good :detect-magic :detect-poison-and-disease
    :guiding-bolt :healing-word :inflict-wounds
    :protection-from-evil-and-good :purify-food-and-drink :sanctuary
    :shield-of-faith},
  2
  #{:aid :augury :blindness-deafness :calm-emotions :continual-flame
    :enhance-ability :find-traps :gentle-repose :hold-person
    :lesser-restoration :locate-object :prayer-of-healing
    :protection-from-poison :silence :spiritual-weapon :warding-bond
    :zone-of-truth},
  3
  #{:animate-dead :beacon-of-hope :bestow-curse :clairvoyance
    :create-food-and-water :daylight :dispel-magic :glyph-of-warding
    :magic-circle :mass-healing-word :meld-into-stone
    :protection-from-energy :remove-curse :revivify :sending
    :speak-with-dead :spirit-guardians :tongues :water-walk},
  4
  #{:banishment :control-water :death-ward :divination
    :freedom-of-movement :locate-creature :stone-shape},
  5
  #{:commune :contagion :dispel-evil-and-good :flame-strike :geas
    :greater-restoration :hallow :insect-plague :legend-lore
    :mass-cure-wounds :planar-binding :raise-dead :scrying},
  6
  #{:blade-barrier :create-undead :find-the-path :forbiddance :harm
    :heal :heroes--feast :planar-ally :true-seeing :word-of-recall},
  7
  #{:conjure-celestial :divine-word :etherealness :fire-storm
    :plane-shift :regenerate :resurrection :symbol},
  8 #{:antimagic-field :control-weather :earthquake :holy-aura},
  9 #{:astral-projection :gate :mass-heal :true-resurrection}},
 :druid
 {0 #{:guidance :mending :produce-flame :resistance :shillelagh},
  1
  #{:charm-person :create-or-destroy-water :cure-wounds :detect-magic
    :detect-poison-and-disease :entangle :faerie-fire :fog-cloud
    :healing-word :jump :longstrider :purify-food-and-drink
    :speak-with-animals :thunderwave},
  2
  #{:animal-messenger :barkskin :darkvision :enhance-ability
    :find-traps :flame-blade :flaming-sphere :gust-of-wind :heat-metal
    :hold-person :lesser-restoration :locate-animals-or-plants
    :locate-object :moonbeam :pass-without-trace
    :protection-from-poison :spike-growth},
  3
  #{:call-lightning :conjure-animals :daylight :dispel-magic
    :meld-into-stone :plant-growth :protection-from-energy :sleet-storm
    :speak-with-plants :water-breathing :water-walk :wind-wall},
  4
  #{:blight :confusion :conjure-minor-elementals
    :conjure-woodland-beings :control-water :dominate-beast
    :freedom-of-movement :giant-insect :hallucinatory-terrain
    :ice-storm :locate-creature :polymorph :stone-shape :stoneskin
    :wall-of-fire},
  5
  #{:antilife-shell :awaken :commune-with-nature :conjure-elemental
    :contagion :geas :greater-restoration :insect-plague
    :mass-cure-wounds :planar-binding :reincarnate :scrying
    :tree-stride :wall-of-stone},
  6
  #{:conjure-fey :find-the-path :heal :heroes--feast :move-earth
    :sunbeam :transport-via-plants :wall-of-thorns :wind-walk},
  7
  #{:fire-storm :mirage-arcane :plane-shift :regenerate
    :reverse-gravity},
  8
  #{:animal-shapes :antipathy-sympathy :control-weather :earthquake
    :feeblemind :sunburst},
  9 #{:foresight :shapechange :storm-of-vengeance :true-resurrection}},
 :paladin
 {1
  #{:bless :command :cure-wounds :detect-evil-and-good :detect-magic
    :detect-poison-and-disease :divine-favor :heroism
    :protection-from-evil-and-good :purify-food-and-drink
    :shield-of-faith},
  2
  #{:aid :find-steed :lesser-restoration :locate-object :magic-weapon
    :protection-from-poison :zone-of-truth},
  3
  #{:create-food-and-water :daylight :dispel-magic :magic-circle
    :remove-curse :revivify},
  4 #{:banishment :death-ward :locate-creature},
  5 #{:dispel-evil-and-good :geas :raise-dead}},
 :ranger
 {1
  #{:alarm :cure-wounds :detect-magic :detect-poison-and-disease
    :fog-cloud :jump :longstrider :speak-with-animals},
  2
  #{:animal-messenger :barkskin :darkvision :find-traps
    :lesser-restoration :locate-animals-or-plants :locate-object
    :pass-without-trace :protection-from-poison :silence
    :spike-growth},
  3
  #{:conjure-animals :daylight :nondetection :plant-growth
    :protection-from-energy :speak-with-plants :water-breathing
    :water-walk :wind-wall},
  4
  #{:conjure-woodland-beings :freedom-of-movement :locate-creature
    :stoneskin},
  5 #{:commune-with-nature :tree-stride}},
 :sorcerer
 {0
  #{:acid-splash :chill-touch :dancing-lights :light :mage-hand
    :mending :message :minor-illusion :prestidigitation :ray-of-frost
    :shocking-grasp :true-strike},
  1
  #{:burning-hands :charm-person :color-spray :comprehend-languages
    :detect-magic :disguise-self :expeditious-retreat :false-life
    :feather-fall :fog-cloud :jump :mage-armor :magic-missile :shield
    :silent-image :sleep :thunderwave},
  2
  #{:alter-self :blindness-deafness :blur :darkness :darkvision
    :detect-thoughts :enhance-ability :enlarge-reduce :gust-of-wind
    :hold-person :invisibility :knock :levitate :mirror-image
    :misty-step :scorching-ray :see-invisibility :shatter :spider-climb
    :suggestion :web},
  3
  #{:clairvoyance :daylight :dispel-magic :fear :fireball :fly
    :gaseous-form :haste :hypnotic-pattern :lightning-bolt :major-image
    :protection-from-energy :sleet-storm :slow :stinking-cloud :tongues
    :water-breathing :water-walk},
  4
  #{:banishment :blight :confusion :dimension-door :dominate-beast
    :greater-invisibility :ice-storm :polymorph :stoneskin
    :wall-of-fire},
  5
  #{:animate-objects :cloudkill :cone-of-cold :creation
    :dominate-person :hold-monster :insect-plague :seeming :telekinesis
    :teleportation-circle :wall-of-stone},
  6
  #{:chain-lightning :circle-of-death :disintegrate :eyebite
    :globe-of-invulnerability :mass-suggestion :move-earth :sunbeam
    :true-seeing},
  7
  #{:delayed-blast-fireball :etherealness :finger-of-death :fire-storm
    :plane-shift :prismatic-spray :reverse-gravity :teleport},
  8
  #{:dominate-monster :earthquake :incendiary-cloud :power-word-stun
    :sunburst},
  9 #{:gate :meteor-swarm :power-word-kill :time-stop :wish}},
 :warlock
 {0
  #{:chill-touch :mage-hand :minor-illusion :prestidigitation
    :true-strike},
  1
  #{:charm-person :comprehend-languages :expeditious-retreat
    :illusory-script :protection-from-evil-and-good :unseen-servant},
  2
  #{:darkness :enthrall :hold-person :invisibility :mirror-image
    :misty-step :ray-of-enfeeblement :shatter :spider-climb
    :suggestion},
  3
  #{:dispel-magic :fear :fly :gaseous-form :hypnotic-pattern
    :magic-circle :major-image :remove-curse :tongues :vampiric-touch},
  4 #{:banishment :blight :dimension-door :hallucinatory-terrain},
  5 #{:contact-other-plane :dream :hold-monster :scrying},
  6
  #{:circle-of-death :conjure-fey :create-undead :eyebite
    :flesh-to-stone :mass-suggestion :true-seeing},
  7 #{:etherealness :finger-of-death :forcecage :plane-shift},
  8
  #{:demiplane :dominate-monster :feeblemind :glibness
    :power-word-stun},
  9 #{:astral-projection :foresight :imprisonment :power-word-kill}},
 :wizard
 {0
  #{:acid-splash :chill-touch :dancing-lights :light :mage-hand
    :mending :message :minor-illusion :prestidigitation :ray-of-frost
    :shocking-grasp :true-strike},
  1
  #{:alarm :burning-hands :charm-person :color-spray
    :comprehend-languages :detect-magic :disguise-self
    :expeditious-retreat :false-life :feather-fall :floating-disk
    :fog-cloud :grease :hideous-laughter :identify :illusory-script
    :jump :longstrider :mage-armor :magic-missile
    :protection-from-evil-and-good :shield :silent-image :sleep
    :thunderwave :unseen-servant},
  2
  #{:acid-arrow :alter-self :arcane-lock :arcanist-s-magic-aura
    :blindness-deafness :blur :continual-flame :darkness :darkvision
    :detect-thoughts :enlarge-reduce :flaming-sphere :gentle-repose
    :gust-of-wind :hold-person :invisibility :knock :levitate
    :locate-object :magic-mouth :magic-weapon :mirror-image :misty-step
    :ray-of-enfeeblement :rope-trick :scorching-ray :see-invisibility
    :shatter :spider-climb :suggestion :web},
  3
  #{:animate-dead :bestow-curse :blink :clairvoyance :dispel-magic
    :fear :fireball :fly :gaseous-form :glyph-of-warding :haste
    :hypnotic-pattern :lightning-bolt :magic-circle :major-image
    :nondetection :phantom-steed :protection-from-energy :remove-curse
    :sending :sleet-storm :slow :stinking-cloud :tiny-hut :tongues
    :vampiric-touch :water-breathing},
  4
  #{:arcane-eye :banishment :black-tentacles :blight :confusion
    :conjure-minor-elementals :control-water :dimension-door :fabricate
    :faithful-hound :fire-shield :greater-invisibility
    :hallucinatory-terrain :ice-storm :locate-creature
    :phantasmal-killer :polymorph :private-sanctum :resilient-sphere
    :secret-chest :stone-shape :stoneskin :wall-of-fire},
  5
  #{:animate-objects :arcane-hand :cloudkill :cone-of-cold
    :conjure-elemental :contact-other-plane :creation :dominate-person
    :dream :geas :hold-monster :legend-lore :mislead :modify-memory
    :passwall :planar-binding :scrying :seeming :telekinesis
    :telepathic-bond :teleportation-circle :wall-of-force
    :wall-of-stone},
  6
  #{:chain-lightning :circle-of-death :contingency :create-undead
    :disintegrate :eyebite :flesh-to-stone :freezing-sphere
    :globe-of-invulnerability :guards-and-wards :instant-summons
    :irresistible-dance :magic-jar :mass-suggestion :move-earth
    :programmed-illusion :sunbeam :true-seeing :wall-of-ice},
  7
  #{:arcane-sword :delayed-blast-fireball :etherealness
    :finger-of-death :forcecage :magnificent-mansion :mirage-arcane
    :plane-shift :prismatic-spray :project-image :reverse-gravity
    :sequester :simulacrum :symbol :teleport},
  8
  #{:antimagic-field :antipathy-sympathy :clone :control-weather
    :demiplane :dominate-monster :feeblemind :incendiary-cloud :maze
    :mind-blank :power-word-stun :sunburst},
  9
  #{:astral-projection :foresight :gate :imprisonment :meteor-swarm
    :power-word-kill :prismatic-wall :shapechange :time-stop
    :true-polymorph :weird :wish}}})
