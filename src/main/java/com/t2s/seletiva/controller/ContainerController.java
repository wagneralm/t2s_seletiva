package com.t2s.seletiva.controller;

import com.t2s.seletiva.model.dto.ContainerDTO;
import com.t2s.seletiva.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/containers")
public class ContainerController {

    @Autowired
    private ContainerService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ContainerDTO> save(@Valid @RequestBody ContainerDTO containerDTO) {
        return ResponseEntity.ok(service.save(containerDTO));
    }

    @PutMapping(path = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ContainerDTO> update(@Valid @RequestBody ContainerDTO containerDTO,@PathVariable Long id) {
        return ResponseEntity.ok(service.uptade(containerDTO, id));
    }

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ContainerDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ContainerDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}
