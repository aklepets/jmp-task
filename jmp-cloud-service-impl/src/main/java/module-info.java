module jmp.cloud.service.impl {
    requires transitive jmp.service.api;
    requires jmp.dto;
    provides jmp.service.api.ServiceInterface with jmp.cloud.service.impl.ServiceImpl;
    exports jmp.cloud.service.impl;
}