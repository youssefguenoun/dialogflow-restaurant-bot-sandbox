# Google DialogFlow restaurant-bot sandbox

This repository holds a dialogflow NLP (Natural Language Processing) model and a Fulfillment Webhook (writing in spring-boot and deployed to Google Appengine Flexible environment).

- the folder **dialogflow-nlp-chatbot** contains the Dialogflow Agent (sources and distribution zip file which we can import directly to a Dialogflow instance)
- the folder **dialogflow-webhook-demo** contains the source codes of the Fulfillment webhook. It's a Java spring-boot project with a maven goal to deploy it to Appengine flexible

A running demo of the restaurant-chatbot is available here : https://bot.dialogflow.com/f998774e-0ec0-4202-b84a-f8bc5456be83

We can discuss with the bot so as to search a restaurant by filling cuisine type and location
For instance we might have questions like : 

- Hi Dude
- Find me and indian restaurant in city center
