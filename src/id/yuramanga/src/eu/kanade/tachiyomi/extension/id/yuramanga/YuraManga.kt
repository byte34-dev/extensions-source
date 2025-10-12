package eu.kanade.tachiyomi.extension.id.yuramanga

import eu.kanade.tachiyomi.multisrc.zmanga.ZManga
import eu.kanade.tachiyomi.source.model.Page
import org.jsoup.nodes.Document
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Locale

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class YuraManga : Madara(
    "bacami",
    "https://bacami.net",
    "id",
    SimpleDateFormat("dd/MM/yyyy", Locale.ROOT),
) 
