Feature: Kafka Interaction

  Scenario: Produce a message and consume it
    Given a Kafka message "Hello, Kafka!"
    When the message is produced to Kafka
    Then a Kafka consumer receives the message
