package www.raven.ospp.metrics.model;

import www.raven.ospp.metrics.util.MeterType;

public class MetricsSample {
    protected String name;
    protected MeterType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MeterType getType() {
        return type;
    }

    public void setType(MeterType type) {
        this.type = type;
    }
}
