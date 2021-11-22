package com.company.command;

import lombok.Data;

@Data
public class TvOffCommand implements Command {

    private Tv tv;

    public TvOffCommand(Tv tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
