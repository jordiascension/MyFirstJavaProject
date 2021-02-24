package com.netmind.model;

import java.util.UUID;

public class NetmindObject {

	private UUID uuid;

	public NetmindObject() {
		uuid = UUID.randomUUID();
	}

	public NetmindObject(UUID uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the id
	 */
	public UUID getUUId() {

		return uuid;
	}
}
