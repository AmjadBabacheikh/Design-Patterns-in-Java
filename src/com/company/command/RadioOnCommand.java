package com.company.command;

import lombok.Data;

@Data
public class RadioOnCommand implements Command {

    private Radio radio;

    public RadioOnCommand(Radio radio){
        this.radio=radio;
    }

    @Override
    public void execute() {
        radio.on();
    }

    @Override
    public void undo() {
        radio.off();
    }
}
