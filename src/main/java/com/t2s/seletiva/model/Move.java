package com.t2s.seletiva.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_move")
public class Move {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "move_type")
    private String moveType;

    @Column(name = "first_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime firstDate;

    @Column(name = "last_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime lastDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    public LocalDateTime getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(LocalDateTime firstDate) {
        this.firstDate = firstDate;
    }

    public LocalDateTime getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDateTime lastDate) {
        this.lastDate = lastDate;
    }
}
