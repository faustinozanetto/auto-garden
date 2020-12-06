package com.retrosen.autogarden.logger;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LoggerFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		return "Thread: " + record.getThreadID() + " | " + "On: " + record.getSourceClassName() + " | " + "At: " + record.getSourceMethodName() + " | " + new Date(record.getMillis()) + " -> " + record.getMessage() + "\n";
	}
}
