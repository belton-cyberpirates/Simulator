package com.qualcomm.robotcore.eventloop.opmode;

public @interface Autonomous {
    public String name() default "";
    public String preselectTeleOp() default "";
}
