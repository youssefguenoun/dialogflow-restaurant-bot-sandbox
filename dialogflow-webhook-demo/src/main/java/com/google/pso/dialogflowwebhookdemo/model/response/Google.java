
package com.google.pso.dialogflowwebhookdemo.model.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "expectUserResponse",
    "richResponse"
})
public class Google {

    @JsonProperty("expectUserResponse")
    private Boolean expectUserResponse;
    @JsonProperty("richResponse")
    private RichResponse richResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("expectUserResponse")
    public Boolean getExpectUserResponse() {
        return expectUserResponse;
    }

    @JsonProperty("expectUserResponse")
    public void setExpectUserResponse(Boolean expectUserResponse) {
        this.expectUserResponse = expectUserResponse;
    }

    @JsonProperty("richResponse")
    public RichResponse getRichResponse() {
        return richResponse;
    }

    @JsonProperty("richResponse")
    public void setRichResponse(RichResponse richResponse) {
        this.richResponse = richResponse;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
