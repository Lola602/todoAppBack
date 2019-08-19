package com.accenture.letovit.todolist.database;

import com.accenture.letovit.todolist.ToDoItem;

/**
 * Converter class that is mapping data between our JSON objects and Database objects
 */	
public class ToDoItemConverter {
	
	/**
	 * Map data from JSON object to Database object with specified identifier
	 * Put all data from ToDoItem to DbToDoItem object
	 */
	public static DbToDoItem jsonToDbEntity(ToDoItem source, String identifier) {
		DbToDoItem target = new DbToDoItem();
		
		target.setCreatedAt(source.getCreatedAt());
		target.setFinished(source.isFinished());
		target.setText(source.getText());
		target.setTitle(source.getTitle());
		
		target.setIdentifier(identifier);
		
		return target;
	}
	
	/**
	 * Map data from Database object to JSON object
	 * Information about identifier get lost
	 */
	public static ToDoItem dbEntityToJson(DbToDoItem source) {
		ToDoItem target = new ToDoItem();
		
		target.setCreatedAt(source.getCreatedAt());
		target.setFinished(source.isFinished());
		target.setText(source.getText());
		target.setTitle(source.getTitle());
		
		target.setId(source.getIdentifier());
		
		return target;
	}
}
