package com.techbank.cqrs.core.commands;

import com.techbank.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@SuperBuilder
public class BaseCommand extends Message {
    public BaseCommand(String id) {
        super(id);
    }
//
//    public BaseCommand() {
//    }
//
    public BaseCommand(MessageBuilder<?, ?> b) {
        super(b);
    }
}
