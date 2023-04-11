package week10.generics;

public class Task implements Comparable<Task>{

        private String name;
        private int duration; // #seconds
        private int priority;

        public Task(String name, int priority, int duration) {
            this.name = name;
            this.priority = priority;
            this.duration = duration;
        }

        public Task(String name, int duration) {
            this.name = name;
            this.priority = 5; // by default MEDIUM priority
            this.duration = duration;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public static Task parseToTask(String entry) {
            Task t = null;

            try {
                String parts[] = entry.trim().split(",");
                t = new Task(parts[0].trim(), Integer.valueOf(parts[1].trim()), Integer.valueOf(parts[2].trim()));
            } catch (Exception e) {
                e.printStackTrace();
            }

            return t;
        }

        public void execute() {
            System.out.println("Executing: " + this.name + "...");
            System.out.println("Completed!");
        }

        @Override
        public String toString() {
            return "Task [duration=" + duration + ", name=" + name + ", priority=" + priority + "]";
        }

        @Override
        public int compareTo(Task o) {
            // it will be used to order tasks: task with higher priority should come first
            if (o.getPriority() == this.priority)
                return 0;
            return o.getPriority() > this.priority ? 1 : -1;

            // return o.getPriority() - this.priority
        }

    }
