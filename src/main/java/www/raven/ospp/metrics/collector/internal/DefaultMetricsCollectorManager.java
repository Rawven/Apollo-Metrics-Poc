package www.raven.ospp.metrics.collector.internal;

import java.util.ArrayList;
import java.util.List;
import www.raven.ospp.metrics.collector.MetricsCollector;
import www.raven.ospp.metrics.collector.MetricsCollectorManager;

public class DefaultMetricsCollectorManager implements MetricsCollectorManager {

    private List<MetricsCollector> collectors = new ArrayList<>();

    public DefaultMetricsCollectorManager() {
        collectors.add(new TestCollector());
    }

    @Override
    public List<MetricsCollector> getCollectors() {
        return collectors;
    }

}
