package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.KafkaUtils;

public class KafkaInteractionSteps {

    private final String topic = "kafkatopic";
    private final String key = "key";
    private String message;
    @Given("a Kafka message {string}")
    public void a_kafka_message(String message) {
        this.message = message;
    }
    @When("the message is produced to Kafka")
    public void the_message_is_produced_to_kafka() {
        KafkaUtils.sendMessage(topic, key, message);
    }
    @Then("a Kafka consumer receives the message")
    public void a_kafka_consumer_receives_the_message() {
        KafkaUtils.consumeMessages(topic);
    }

}
