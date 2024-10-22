package com.qualcomm.robotcore.eventloop.opmode;

public @interface TeleOp {
    public String name() default "";
    public String group() default "";
}
