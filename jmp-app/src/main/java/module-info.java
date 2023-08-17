module app {
//    TODO:
//    2 below returns module not found. why?
//    requires jmp.cloud.bank.impl;
//    requires jmp.cloud.service.impl;
    requires jmp.dto;
    requires jmp.service.api;
    uses jmp.service.api.ServiceInterface;
//     below returns module not found. why?
    //    requires jmp.bank.api;
//    uses jmp.bank.api.BankInterface;
}