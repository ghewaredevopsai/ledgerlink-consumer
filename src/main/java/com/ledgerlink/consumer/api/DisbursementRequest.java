package com.ledgerlink.consumer.api;

import com.ledgerlink.consumer.service.PayrollItem;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.List;

public class DisbursementRequest {

    @NotBlank
    private String batchId;

    @NotEmpty
    private List<PayrollItem> items;

    private LocalDate valueDate;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public List<PayrollItem> getItems() {
        return items;
    }

    public void setItems(List<PayrollItem> items) {
        this.items = items;
    }

    public LocalDate getValueDate() {
        return valueDate;
    }

    public void setValueDate(LocalDate valueDate) {
        this.valueDate = valueDate;
    }
}
