package com.company.command;

import lombok.Data;

@Data
public class TvOnCommand implements Command {
    private Tv tv;

    public TvOnCommand(Tv tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
