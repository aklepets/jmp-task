module jmp.cloud.bank.impl {
    requires transitive jmp.bank.api;
    requires jmp.dto;
    provides jmp.bank.api.BankInterface with jmp.cloud.bank.impl.BankImpl;
    exports jmp.cloud.bank.impl;
}