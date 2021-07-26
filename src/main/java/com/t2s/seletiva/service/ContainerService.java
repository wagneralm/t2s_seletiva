package com.t2s.seletiva.service;

import com.t2s.seletiva.exceptions.NotFoundException;
import com.t2s.seletiva.mapper.ContainerMapper;
import com.t2s.seletiva.model.Container;
import com.t2s.seletiva.model.dto.ContainerDTO;
import com.t2s.seletiva.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContainerService {

    @Autowired
    private ContainerRepository repository;

    private final ContainerMapper mapper = ContainerMapper.INSTANCE;

    @Transactional
    public ContainerDTO save(ContainerDTO containerDTO) {
        Container container = mapper.toModel(containerDTO);
        repository.save(container);
        return containerDTO;
    }

    @Transactional
    public ContainerDTO uptade(ContainerDTO containerDTO, Long id) {
        Container container = mapper.toModel(containerDTO);
        repository.save(container);
        return mapper.toTDO(container);
    }

    @Transactional
    public void delete(Long id) {
        Optional<Container> container = repository.findById(id);
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<ContainerDTO> findAll() {
        List<Container> containerList = repository.findAll();
        return containerList.stream().map(mapper::toTDO).collect(Collectors.toList());
    }



    @Transactional(readOnly = true)
    public ContainerDTO findById(Long id) {
        return repository.findById(id).map(mapper::toTDO).orElseThrow(NotFoundException::new);
    }
}
