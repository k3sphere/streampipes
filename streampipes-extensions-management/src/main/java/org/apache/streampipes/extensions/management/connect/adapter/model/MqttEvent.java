package org.apache.streampipes.extensions.management.connect.adapter.model;

public class MqttEvent {
  private byte[] payload;
  private String topic;
  private String clientId;
  public MqttEvent(String topic, byte[] payload) {
    this.topic = topic;
    this.payload = payload;
  }
  public byte[] getPayload() {
    return payload;
  }
  public void setPayload(byte[] payload) {
    this.payload = payload;
  }
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }
  
  
}
