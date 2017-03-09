module demo2 {
    struct TimeOfDay {
        short hour;    // 0 - 23
        short minute;  // 0 - 59
        short second;  // 0 - 59
    };

    interface Clock {
        TimeOfDay getTime();
        void setTime(TimeOfDay time);
    };
};