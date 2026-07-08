package com.pguillen.portfolio.ui.theme

import androidx.compose.ui.graphics.Color

data class PortfolioColors(
	val background: Color,
	val sidebar: Color,
	val surface: Color,
	val surfaceVariant: Color,
	val textPrimary: Color,
	val textSecondary: Color,
	val border: Color,
	val accent: Color,
	val accentSoft: Color,
	val onAccent: Color,
	val icon: Color,
	val iconMuted: Color
)

val LightPortfolioColors = PortfolioColors(
	background = Color(0xFFF8FAFC),
	sidebar = Color(0xFFFFFFFF),
	surface = Color(0xFFFFFFFF),
	surfaceVariant = Color(0xFFF1F5F9),
	textPrimary = Color(0xFF111827),
	textSecondary = Color(0xFF6B7280),
	border = Color(0xFFE5E7EB),
	accent = Color(0xFF2563EB),
	accentSoft = Color(0xFFEFF6FF),
	onAccent = Color(0xFFFFFFFF),
	icon = Color(0xFF475569),
	iconMuted = Color(0xFF94A3B8)
)

val DarkPortfolioColors = PortfolioColors(
	background = Color(0xFF0F172A),
	sidebar = Color(0xFF020617),
	surface = Color(0xFF111827),
	surfaceVariant = Color(0xFF1E293B),
	textPrimary = Color(0xFFF9FAFB),
	textSecondary = Color(0xFFCBD5E1),
	border = Color(0xFF334155),
	accent = Color(0xFF3B82F6),
	accentSoft = Color(0xFF172554),
	onAccent = Color(0xFFFFFFFF),
	icon = Color(0xFFE2E8F0),
	iconMuted = Color(0xFF94A3B8)
)
