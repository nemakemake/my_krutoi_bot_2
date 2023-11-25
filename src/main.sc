require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Let's start.

    state: Hello
        intent!: /hello
        a: privet

    state: Weather
        intent!: /weather
        a: sunny
        
    state: Currency
        intent!: /currency
        a: 100 dollarov eto 1 kopeika

    state: NoMatch
        event!: noMatch
        a: I do not understand. You said: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}