package com.vincent_falzon.discreetlauncher ;

// License
/*

	This file is part of Discreet Launcher.

	Copyright (C) 2019-2021 Vincent Falzon

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see <https://www.gnu.org/licenses/>.

 */

/**
 * Provide all the constants of the application.
 */
public interface Constants
{
	// Constants related to internal files
	String FILE_FAVORITES = "favorites.txt" ;
	String FILE_FOLDER_PREFIX = "folder_" ;
	String FILE_FOLDERS_COLORS = "folders_colors.txt" ;
	String FILE_HIDDEN = "hidden.txt" ;
	String FILE_RENAME_APPS = "rename_apps.txt" ;
	String FILE_SHORTCUTS = "shortcuts.txt" ;
	String FILE_SHORTCUTS_LEGACY = "shortcuts_legacy.txt" ;
	String FILE_ICON_SHORTCUT_PREFIX = "icon_shortcut_" ;

	// Constants related to applications
	String APK_SEARCH = "discreetlauncher.search" ;
	String APK_FOLDER = "discreetlauncher.folder" ;
	String APK_SHORTCUT = "discreetlauncher.shortcut" ;
	String APK_SHORTCUT_LEGACY = "discreetlauncher.shortcut_legacy" ;
	String SEPARATOR = "--SEPARATOR--" ;
	String SHORTCUT_SEPARATOR = "--SHORT--CUT--" ;

	// Constants representing settings keys
	String NONE = "none" ;
	String APPLICATION_THEME = "application_theme" ;
	String TRANSPARENT_STATUS_BAR = "transparent_status_bar" ;
	String BACKGROUND_COLOR_FAVORITES = "background_color_favorites" ;
	String BACKGROUND_COLOR_DRAWER = "background_color_drawer" ;
	String CLOCK_FORMAT = "clock_format" ;
	String CLOCK_COLOR = "clock_color" ;
	String CLOCK_SHADOW_COLOR = "clock_shadow_color" ;
	String CLOCK_POSITION = "clock_position" ;
	String ICON_PACK = "icon_pack" ;
	String HIDE_APP_NAMES = "hide_app_names" ;
	String REMOVE_PADDING = "remove_padding" ;
	String NOTIFICATION = "notification" ;
	String FORCED_ORIENTATION = "forced_orientation" ;
	String ALWAYS_SHOW_FAVORITES = "always_show_favorites" ;
	String IMMERSIVE_MODE = "immersive_mode" ;
	String REVERSE_INTERFACE = "reverse_interface" ;
	String TOUCH_TARGETS = "touch_targets" ;
	String HIDE_MENU_BUTTON = "hide_menu_button" ;
	String DISABLE_APP_DRAWER = "disable_app_drawer" ;
	String SWIPE_LEFTWARDS = "swipe_leftwards" ;
	String SWIPE_RIGHTWARDS = "swipe_rightwards" ;

	// Constants represetings fallback colors
	String COLOR_FOR_OVERLAY = "#66000000" ;
	String COLOR_FOR_TEXT_ON_OVERLAY = "#FFFFFFFF" ;

	// --- Constants representing old settings keys for compatibility ---
	// Removed in v3.1.0 (migrated to internal file hidden.txt)
	String HIDDEN_APPLICATIONS = "hidden_applications" ;
	String HIDDEN_APPS_SEPARATOR = "_discreet_" ;
	// Removed in v4.0.0 (merged with CLOCK_FORMAT)
	String DISPLAY_CLOCK = "display_clock" ;
	// Removed in v5.2.0 (merged with FORCED_ORIENTATION)
	String FORCE_PORTRAIT = "force_portrait" ;
	// Removed in v5.2.0 (splitted between favorites and app drawer)
	String BACKGROUND_COLOR = "background_color" ;
}
