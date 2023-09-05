# web-scada
```java
package ru.schung.webscadabulgar.model;

import lombok.Data;

@Data
public class HistoryTelemetry {
    private long valueTime;
    private Double value;
    private String name;
}
```
