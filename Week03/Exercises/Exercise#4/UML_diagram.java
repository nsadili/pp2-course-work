|   CustomTime    |
+-----------------+
| - hour: int     |
| - minute: int   |
| - second: int   |
+-----------------+
| + CustomTime()  |
| + CustomTime(hour: int, minute: int, second: int)  |
| + CustomTime(hour: int) |
| + CustomTime(hour: int, minute: int) |
| + CustomTime(time: CustomTime) |
| + getHour(): int |
| + getMinute(): int |
| + getSecond(): int |
| + toUniversalString(): String |
| + toStandardString(): String |
+-----------------+