class CustomTime {
    private int m_hour, m_minute, m_second;

    // Default constructor
    public CustomTime(int hour, int minute, int second) {
        this.m_hour = hour;
        this.m_minute = minute;
        this.m_second = second;
    }

    // Constructor without arguments
    public CustomTime() {
        this.m_hour = 0;
        this.m_minute = 0;
        this.m_second = 0;
    }

    // Constructor without seconds
    public CustomTime(int hour, int minute) {
        this.m_hour = hour; this.m_minute = minute;
        this.m_second = 0;
    }

    // Additional class constructor
    public CustomTime(CustomTime cTime) {
        this(cTime.getHour(), cTime.getMinute(), cTime.getSecond());
    }

    // Setters
    public void setHour(int hour) { this.m_hour = hour; }
    public void setMinute(int minute) { this.m_minute = minute; }
    public void setSecond(int second) { this.m_second = second; }

    // Getters
    public int getHour() { return m_hour; }
    public int getMinute() { return m_minute; }
    public int getSecond() { return m_second; }

    // Universal
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", m_hour, m_minute, m_second);
    }

    // Standart
    public String toStandartString() {
        if (m_hour > 12) {
            return String.format("%02d:%02d:%02d PM", m_hour, m_minute, m_second);
        } else return String.format("%02d:%02d:%02d AM", m_hour, m_minute, m_second);
    }
}