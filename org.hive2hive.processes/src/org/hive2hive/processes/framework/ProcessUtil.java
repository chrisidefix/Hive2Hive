package org.hive2hive.processes.framework;

import java.util.UUID;

public final class ProcessUtil {

	public static String generateID() {
		return UUID.randomUUID().toString();
	}
}
