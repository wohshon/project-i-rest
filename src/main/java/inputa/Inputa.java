
package inputa;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "data",
    "included"
})
public class Inputa {

    @JsonProperty("data")
    private List<Datum> data = new ArrayList<Datum>();
    @JsonProperty("included")
    private List<Included> included = new ArrayList<Included>();

    /**
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The included
     */
    @JsonProperty("included")
    public List<Included> getIncluded() {
        return included;
    }

    /**
     * 
     * @param included
     *     The included
     */
    @JsonProperty("included")
    public void setIncluded(List<Included> included) {
        this.included = included;
    }

}
