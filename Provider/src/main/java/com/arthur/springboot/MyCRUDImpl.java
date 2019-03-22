package com.arthur.springboot;

import com.alibaba.dubbo.config.annotation.Service;

@Service(
        version = "${hello.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class MyCRUDImpl implements MyCRUD{
    @Override
    public void insert() {

    }

    @Override
    public void delect() {

    }

    @Override
    public void update() {

    }

    @Override
    public void select() {

    }
}
