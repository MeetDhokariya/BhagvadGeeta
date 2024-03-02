package com.example.bhagvadgeeta.ModelClass

import com.google.gson.annotations.SerializedName

data class GeetaChapterModel(


	@field:SerializedName("GeetaChapterModel")
	val geetaChapterModel: List<GeetaChapterModelItem?>? = null

)

data class GeetaChapterModelItem(

	@field:SerializedName("name_meaning")
	val nameMeaning: String? = null,

	@field:SerializedName("name_translated")
	val nameTranslated: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("verses_count")
	val versesCount: Int? = null,

	@field:SerializedName("chapter_number")
	val chapterNumber: Int? = null,

	@field:SerializedName("chapter_summary")
	val chapterSummary: String? = null,

	@field:SerializedName("chapter_summary_hindi")
	val chapterSummaryHindi: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("name_transliterated")
	val nameTransliterated: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null
)
