package com.t2s.seletiva.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

public class ContainerDTO {

    private Long id;

    @NotEmpty
    @NotNull
    private String client;

    @NotNull
    @Pattern(regexp = "[A-Z]{4}[0-9]{7}")
    private String numberContainer;

    @NotNull
    @Pattern(regexp = "20|40")
    private String type;

    @NotNull
    @Pattern(regexp = "Cheio|Vazio")
    private String status;

    @NotNull
    @Pattern(regexp = "Importação|Exportação")
    private String category;

    @Valid
    private List<MoveDTO> movesDtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getNumberContainer() {
        return numberContainer;
    }

    public void setNumberContainer(String numberContainer) {
        this.numberContainer = numberContainer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<MoveDTO> getMovesDtos() {
        return movesDtos;
    }

    public void setMovesDtos(List<MoveDTO> movesDtos) {
        this.movesDtos = movesDtos;
    }
}
