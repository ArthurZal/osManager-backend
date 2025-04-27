package model;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public class ServiceOrder {
    private Long id;
    private String description;
    private LocalDateTime openingDate;
    private LocalDateTime conclusionDate;
    private Status status;
    private Client client;

    public ServiceOrder(Long id, String description, LocalDateTime openingDate, LocalDateTime conclusionDate, Status status, Client client) {
        this.id = id;
        this.description = description;
        this.openingDate = openingDate;
        this.conclusionDate = conclusionDate;
        this.status = status;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDateTime openingDate) {
        this.openingDate = openingDate;
    }

    public LocalDateTime getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(LocalDateTime conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public Status getStatus() {
        return  status;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public Client getClient() {
        return  client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


}
