package org.gwtbootstrap3.client.ui.constants;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.gwtbootstrap3.client.ui.base.helper.EnumHelper;

import com.google.gwt.dom.client.Style;

/**
 * You can use the fontawesome-enum-helper.js to grab and enum names (located in the client/resource/css folder
 *
 * @author Sven Jacobs
 * @author Joshua Godi
 */
public enum IconType implements Type, Style.HasCssName {
    SYN_LOGO("syn-logo"),
    SYN_CRASH_HELMET("syn-crash-helmet"),
    SYN_TIMER("syn-timer"),

    ADJUST("fa-adjust"),
    ADN("fa-adn"),
    ALIGN_CENTER("fa-align-center"),
    ALIGN_JUSTIFY("fa-align-justify"),
    ALIGN_LEFT("fa-align-left"),
    ALIGN_RIGHT("fa-align-right"),
    AMAZON("fa-amazon"),
    AMBULANCE("fa-ambulance"),
    AMERICAN_SIGN_LANGUAGE_INTERPRETING("fa-american-sign-language-interpreting"),
    ANCHOR("fa-anchor"),
    ANDROID("fa-android"),
    ANGELLIST("fa-angellist"),
    ANGLE_DOUBLE_DOWN("fa-angle-double-down"),
    ANGLE_DOUBLE_LEFT("fa-angle-double-left"),
    ANGLE_DOUBLE_RIGHT("fa-angle-double-right"),
    ANGLE_DOUBLE_UP("fa-angle-double-up"),
    ANGLE_DOWN("fa-angle-down"),
    ANGLE_LEFT("fa-angle-left"),
    ANGLE_RIGHT("fa-angle-right"),
    ANGLE_UP("fa-angle-up"),
    APPLE("fa-apple"),
    ARCHIVE("fa-archive"),
    AREA_CHART("fa-area-chart"),
    ARROWS("fa-arrows"),
    ARROWS_ALT("fa-arrows-alt"),
    ARROWS_H("fa-arrows-h"),
    ARROWS_V("fa-arrows-v"),
    ARROW_CIRCLE_DOWN("fa-arrow-circle-down"),
    ARROW_CIRCLE_LEFT("fa-arrow-circle-left"),
    ARROW_CIRCLE_O_DOWN("fa-arrow-circle-o-down"),
    ARROW_CIRCLE_O_LEFT("fa-arrow-circle-o-left"),
    ARROW_CIRCLE_O_RIGHT("fa-arrow-circle-o-right"),
    ARROW_CIRCLE_O_UP("fa-arrow-circle-o-up"),
    ARROW_CIRCLE_RIGHT("fa-arrow-circle-right"),
    ARROW_CIRCLE_UP("fa-arrow-circle-up"),
    ARROW_DOWN("fa-arrow-down"),
    ARROW_LEFT("fa-arrow-left"),
    ARROW_RIGHT("fa-arrow-right"),
    ARROW_UP("fa-arrow-up"),
    ASL_INTERPRETING("fa-asl-interpreting"),
    ASSISTIVE_LISTENING_SYSTEMS("fa-assistive-listening-systems"),
    ASTERISK("fa-asterisk"),
    AT("fa-at"),
    AUDIO_DESCRIPTION("fa-audio-description"),
    AUTOMOBILE("fa-automobile"),
    BACKWARD("fa-backward"),
    BALANCE_SCALE("fa-balance-scale"),
    BAN("fa-ban"),
    BANK("fa-bank"),
    BARCODE("fa-barcode"),
    BARS("fa-bars"),
    BAR_CHART("fa-bar-chart"),
    BAR_CHART_O("fa-bar-chart-o"),
    BATTERY_0("fa-battery-0"),
    BATTERY_1("fa-battery-1"),
    BATTERY_2("fa-battery-2"),
    BATTERY_3("fa-battery-3"),
    BATTERY_4("fa-battery-4"),
    BATTERY_EMPTY("fa-battery-empty"),
    BATTERY_FULL("fa-battery-full"),
    BATTERY_HALF("fa-battery-half"),
    BATTERY_QUARTER("fa-battery-quarter"),
    BATTERY_THREE_QUARTERS("fa-battery-three-quarters"),
    BED("fa-bed"),
    BEER("fa-beer"),
    BEHANCE("fa-behance"),
    BEHANCE_SQUARE("fa-behance-square"),
    BELL("fa-bell"),
    BELL_O("fa-bell-o"),
    BELL_SLASH("fa-bell-slash"),
    BELL_SLASH_O("fa-bell-slash-o"),
    BICYCLE("fa-bicycle"),
    BINOCULARS("fa-binoculars"),
    BIRTHDAY_CAKE("fa-birthday-cake"),
    BITBUCKET("fa-bitbucket"),
    BITBUCKET_SQUARE("fa-bitbucket-square"),
    BITCOIN("fa-bitcoin"),
    BLACK_TIE("fa-black-tie"),
    BLIND("fa-blind"),
    BLUETOOTH("fa-bluetooth"),
    BLUETOOTH_B("fa-bluetooth-b"),
    BOLD("fa-bold"),
    BOLT("fa-bolt"),
    BOMB("fa-bomb"),
    BOOK("fa-book"),
    BOOKMARK("fa-bookmark"),
    BOOKMARK_O("fa-bookmark-o"),
    BRAILLE("fa-braille"),
    BRIEFCASE("fa-briefcase"),
    BTC("fa-btc"),
    BUG("fa-bug"),
    BUILDING("fa-building"),
    BUILDING_O("fa-building-o"),
    BULLHORN("fa-bullhorn"),
    BULLSEYE("fa-bullseye"),
    BUS("fa-bus"),
    BUYSELLADS("fa-buysellads"),
    CAB("fa-cab"),
    CALCULATOR("fa-calculator"),
    CALENDAR("fa-calendar"),
    CALENDAR_CHECK_O("fa-calendar-check-o"),
    CALENDAR_MINUS_O("fa-calendar-minus-o"),
    CALENDAR_O("fa-calendar-o"),
    CALENDAR_PLUS_O("fa-calendar-plus-o"),
    CALENDAR_TIMES_O("fa-calendar-times-o"),
    CAMERA("fa-camera"),
    CAMERA_RETRO("fa-camera-retro"),
    CAR("fa-car"),
    CARET_DOWN("fa-caret-down"),
    CARET_LEFT("fa-caret-left"),
    CARET_RIGHT("fa-caret-right"),
    CARET_SQUARE_O_DOWN("fa-caret-square-o-down"),
    CARET_SQUARE_O_LEFT("fa-caret-square-o-left"),
    CARET_SQUARE_O_RIGHT("fa-caret-square-o-right"),
    CARET_SQUARE_O_UP("fa-caret-square-o-up"),
    CARET_UP("fa-caret-up"),
    CART_ARROW_DOWN("fa-cart-arrow-down"),
    CART_PLUS("fa-cart-plus"),
    CC("fa-cc"),
    CC_AMEX("fa-cc-amex"),
    CC_DINERS_CLUB("fa-cc-diners-club"),
    CC_DISCOVER("fa-cc-discover"),
    CC_JCB("fa-cc-jcb"),
    CC_MASTERCARD("fa-cc-mastercard"),
    CC_PAYPAL("fa-cc-paypal"),
    CC_STRIPE("fa-cc-stripe"),
    CC_VISA("fa-cc-visa"),
    CERTIFICATE("fa-certificate"),
    CHAIN("fa-chain"),
    CHAIN_BROKEN("fa-chain-broken"),
    CHECK("syn-check"),
    CHECK_CIRCLE("syn-check-circle"),
    CHECK_CIRCLE_O("fa-check-circle-o"),
    CHECK_SQUARE("fa-check-square"),
    CHECK_SQUARE_O("fa-check-square-o"),
    CHEVRON_CIRCLE_DOWN("fa-chevron-circle-down"),
    CHEVRON_CIRCLE_LEFT("fa-chevron-circle-left"),
    CHEVRON_CIRCLE_RIGHT("fa-chevron-circle-right"),
    CHEVRON_CIRCLE_UP("fa-chevron-circle-up"),
    CHEVRON_DOWN("syn-chevron-down"),
    CHEVRON_LEFT("fa-chevron-left"),
    CHEVRON_RIGHT("fa-chevron-right"),
    CHEVRON_UP("syn-chevron-up"),
    CHILD("fa-child"),
    CHROME("fa-chrome"),
    CIRCLE("fa-circle"),
    CIRCLE_O("fa-circle-o"),
    CIRCLE_O_NOTCH("fa-circle-o-notch"),
    CIRCLE_THIN("fa-circle-thin"),
    CLIPBOARD("fa-clipboard"),
    CLOCK_O("fa-clock-o"),
    CLONE("fa-clone"),
    CLOSE("syn-close"),
    CLOUD("fa-cloud"),
    CLOUD_DOWNLOAD("fa-cloud-download"),
    CLOUD_UPLOAD("fa-cloud-upload"),
    CNY("fa-cny"),
    CODE("fa-code"),
    CODEPEN("fa-codepen"),
    CODE_FORK("fa-code-fork"),
    CODIEPIE("fa-codiepie"),
    COFFEE("fa-coffee"),
    COG("fa-cog"),
    COGS("fa-cogs"),
    COLUMNS("fa-columns"),
    COMMENT("fa-comment"),
    COMMENTING("fa-commenting"),
    COMMENTING_O("fa-commenting-o"),
    COMMENTS("fa-comments"),
    COMMENTS_O("fa-comments-o"),
    COMMENT_O("fa-comment-o"),
    COMPASS("fa-compass"),
    COMPRESS("fa-compress"),
    CONNECTDEVELOP("fa-connectdevelop"),
    CONTAO("fa-contao"),
    COPY("fa-copy"),
    COPYRIGHT("fa-copyright"),
    CREATIVE_COMMONS("fa-creative-commons"),
    CREDIT_CARD("fa-credit-card"),
    CREDIT_CARD_ALT("fa-credit-card-alt"),
    CROP("fa-crop"),
    CROSSHAIRS("fa-crosshairs"),
    CSS3("fa-css3"),
    CUBE("fa-cube"),
    CUBES("fa-cubes"),
    CUT("fa-cut"),
    CUTLERY("fa-cutlery"),
    DASHBOARD("fa-dashboard"),
    DASHCUBE("fa-dashcube"),
    DATABASE("syn-database"),
    DEAF("fa-deaf"),
    DEAFNESS("fa-deafness"),
    DEDENT("fa-dedent"),
    DELICIOUS("fa-delicious"),
    DESKTOP("fa-desktop"),
    DEVIANTART("fa-deviantart"),
    DIAMOND("fa-diamond"),
    DIGG("fa-digg"),
    DOLLAR("fa-dollar"),
    DOT_CIRCLE_O("fa-dot-circle-o"),
    DOWNLOAD("syn-download"),
    DRIBBBLE("fa-dribbble"),
    DROPBOX("fa-dropbox"),
    DRUPAL("fa-drupal"),
    EDGE("fa-edge"),
    EDIT("fa-edit"),
    EJECT("fa-eject"),
    ELLIPSIS_H("fa-ellipsis-h"),
    ELLIPSIS_V("syn-ellipsis-v"),
    EMPIRE("fa-empire"),
    ENVELOPE("fa-envelope"),
    ENVELOPE_O("fa-envelope-o"),
    ENVELOPE_SQUARE("fa-envelope-square"),
    ENVIRA("fa-envira"),
    ERASER("fa-eraser"),
    EUR("fa-eur"),
    EURO("fa-euro"),
    EXCHANGE("fa-exchange"),
    EXCLAMATION("fa-exclamation"),
    EXCLAMATION_CIRCLE("fa-exclamation-circle"),
    EXCLAMATION_TRIANGLE("fa-exclamation-triangle"),
    EXPAND("fa-expand"),
    EXPEDITEDSSL("fa-expeditedssl"),
    EXTERNAL_LINK("fa-external-link"),
    EXTERNAL_LINK_SQUARE("fa-external-link-square"),
    EYE("fa-eye"),
    EYEDROPPER("fa-eyedropper"),
    EYE_SLASH("fa-eye-slash"),
    FA("fa-fa"),
    FACEBOOK("fa-facebook"),
    FACEBOOK_F("fa-facebook-f"),
    FACEBOOK_OFFICIAL("fa-facebook-official"),
    FACEBOOK_SQUARE("fa-facebook-square"),
    FAST_BACKWARD("fa-fast-backward"),
    FAST_FORWARD("fa-fast-forward"),
    FAX("fa-fax"),
    FEED("fa-feed"),
    FEMALE("fa-female"),
    FIGHTER_JET("fa-fighter-jet"),
    FILE("syn-file"),
    FILES_O("fa-files-o"),
    FILE_ARCHIVE_O("fa-file-archive-o"),
    FILE_AUDIO_O("fa-file-audio-o"),
    FILE_CODE_O("fa-file-code-o"),
    FILE_EXCEL_O("fa-file-excel-o"),
    FILE_IMAGE_O("fa-file-image-o"),
    FILE_MOVIE_O("fa-file-movie-o"),
    FILE_O("fa-file-o"),
    FILE_PDF_O("fa-file-pdf-o"),
    FILE_PHOTO_O("fa-file-photo-o"),
    FILE_PICTURE_O("fa-file-picture-o"),
    FILE_POWERPOINT_O("fa-file-powerpoint-o"),
    FILE_SOUND_O("fa-file-sound-o"),
    FILE_TEXT("fa-file-text"),
    FILE_TEXT_O("fa-file-text-o"),
    FILE_VIDEO_O("fa-file-video-o"),
    FILE_WORD_O("fa-file-word-o"),
    FILE_ZIP_O("fa-file-zip-o"),
    FILM("fa-film"),
    FILTER("fa-filter"),
    FIRE("fa-fire"),
    FIREFOX("fa-firefox"),
    FIRE_EXTINGUISHER("fa-fire-extinguisher"),
    FIRST_ORDER("fa-first-order"),
    FLAG("fa-flag"),
    FLAG_CHECKERED("fa-flag-checkered"),
    FLAG_O("fa-flag-o"),
    FLASH("fa-flash"),
    FLASK("fa-flask"),
    FLICKR("fa-flickr"),
    FLOPPY_O("fa-floppy-o"),
    FOLDER("fa-folder"),
    FOLDER_O("fa-folder-o"),
    FOLDER_OPEN("fa-folder-open"),
    FOLDER_OPEN_O("fa-folder-open-o"),
    FOLDER_PLUS("syn-folder-plus"),
    FONT("fa-font"),
    FONTICONS("fa-fonticons"),
    FONT_AWESOME("fa-font-awesome"),
    FORT_AWESOME("fa-fort-awesome"),
    FORUMBEE("fa-forumbee"),
    FORWARD("fa-forward"),
    FOURSQUARE("fa-foursquare"),
    FROWN_O("fa-frown-o"),
    FUTBOL_O("fa-futbol-o"),
    GAMEPAD("fa-gamepad"),
    GAVEL("fa-gavel"),
    GBP("fa-gbp"),
    GE("fa-ge"),
    GEAR("fa-gear"),
    GEARS("fa-gears"),
    GENDERLESS("fa-genderless"),
    GET_POCKET("fa-get-pocket"),
    GG("fa-gg"),
    GG_CIRCLE("fa-gg-circle"),
    GIFT("fa-gift"),
    GIT("fa-git"),
    GITHUB("fa-github"),
    GITHUB_ALT("fa-github-alt"),
    GITHUB_SQUARE("fa-github-square"),
    GITLAB("fa-gitlab"),
    GITTIP("fa-gittip"),
    GIT_SQUARE("fa-git-square"),
    GLASS("fa-glass"),
    GLIDE("fa-glide"),
    GLIDE_G("fa-glide-g"),
    GLOBE("fa-globe"),
    GOOGLE("fa-google"),
    GOOGLE_PLUS("fa-google-plus"),
    GOOGLE_PLUS_CIRCLE("fa-google-plus-circle"),
    GOOGLE_PLUS_OFFICIAL("fa-google-plus-official"),
    GOOGLE_PLUS_SQUARE("fa-google-plus-square"),
    GOOGLE_WALLET("fa-google-wallet"),
    GRADUATION_CAP("fa-graduation-cap"),
    GRATIPAY("fa-gratipay"),
    GROUP("fa-group"),
    HACKER_NEWS("fa-hacker-news"),
    HAND_GRAB_O("fa-hand-grab-o"),
    HAND_LIZARD_O("fa-hand-lizard-o"),
    HAND_O_DOWN("fa-hand-o-down"),
    HAND_O_LEFT("fa-hand-o-left"),
    HAND_O_RIGHT("fa-hand-o-right"),
    HAND_O_UP("fa-hand-o-up"),
    HAND_PAPER_O("fa-hand-paper-o"),
    HAND_PEACE_O("fa-hand-peace-o"),
    HAND_POINTER_O("fa-hand-pointer-o"),
    HAND_ROCK_O("fa-hand-rock-o"),
    HAND_SCISSORS_O("fa-hand-scissors-o"),
    HAND_SPOCK_O("fa-hand-spock-o"),
    HAND_STOP_O("fa-hand-stop-o"),
    HARD_OF_HEARING("fa-hard-of-hearing"),
    HASHTAG("fa-hashtag"),
    HDD_O("fa-hdd-o"),
    HEADER("fa-header"),
    HEADPHONES("fa-headphones"),
    HEART("fa-heart"),
    HEARTBEAT("fa-heartbeat"),
    HEART_O("fa-heart-o"),
    HISTORY("fa-history"),
    HOME("fa-home"),
    HOSPITAL_O("fa-hospital-o"),
    HOTEL("fa-hotel"),
    HOURGLASS("fa-hourglass"),
    HOURGLASS_1("fa-hourglass-1"),
    HOURGLASS_2("fa-hourglass-2"),
    HOURGLASS_3("fa-hourglass-3"),
    HOURGLASS_END("fa-hourglass-end"),
    HOURGLASS_HALF("fa-hourglass-half"),
    HOURGLASS_O("fa-hourglass-o"),
    HOURGLASS_START("fa-hourglass-start"),
    HOUZZ("fa-houzz"),
    HTML5("fa-html5"),
    H_SQUARE("fa-h-square"),
    ILS("fa-ils"),
    IMAGE("fa-image"),
    INBOX("fa-inbox"),
    INDENT("fa-indent"),
    INDUSTRY("fa-industry"),
    INFO("fa-info"),
    INFO_CIRCLE("syn-info-circle"),
    INR("fa-inr"),
    INSTAGRAM("fa-instagram"),
    INSTITUTION("fa-institution"),
    INTERNET_EXPLORER("fa-internet-explorer"),
    INTERSEX("fa-intersex"),
    IOXHOST("fa-ioxhost"),
    ITALIC("fa-italic"),
    I_CURSOR("fa-i-cursor"),
    JOOMLA("fa-joomla"),
    JPY("fa-jpy"),
    JSFIDDLE("fa-jsfiddle"),
    KEY("fa-key"),
    KEYBOARD_O("fa-keyboard-o"),
    KRW("fa-krw"),
    LANGUAGE("fa-language"),
    LAPTOP("fa-laptop"),
    LASTFM("fa-lastfm"),
    LASTFM_SQUARE("fa-lastfm-square"),
    LEAF("fa-leaf"),
    LEANPUB("fa-leanpub"),
    LEGAL("fa-legal"),
    LEMON_O("fa-lemon-o"),
    LEVEL_DOWN("fa-level-down"),
    LEVEL_UP("fa-level-up"),
    LIFE_BOUY("fa-life-bouy"),
    LIFE_BUOY("fa-life-buoy"),
    LIFE_RING("fa-life-ring"),
    LIFE_SAVER("fa-life-saver"),
    LIGHTBULB_O("fa-lightbulb-o"),
    LINE_CHART("fa-line-chart"),
    LINK("fa-link"),
    LINKEDIN("fa-linkedin"),
    LINKEDIN_SQUARE("fa-linkedin-square"),
    LINUX("fa-linux"),
    LIST("fa-list"),
    LIST_ALT("fa-list-alt"),
    LIST_OL("fa-list-ol"),
    LIST_UL("fa-list-ul"),
    LOADING("syn-loading"),
    LOCATION_ARROW("fa-location-arrow"),
    LOCK("fa-lock"),
    LOCK_OPEN("syn-lock-open"),
    LONG_ARROW_DOWN("fa-long-arrow-down"),
    LONG_ARROW_LEFT("fa-long-arrow-left"),
    LONG_ARROW_RIGHT("fa-long-arrow-right"),
    LONG_ARROW_UP("fa-long-arrow-up"),
    LOW_VISION("fa-low-vision"),
    MAGIC("fa-magic"),
    MAGNET("fa-magnet"),
    MAIL_FORWARD("fa-mail-forward"),
    MAIL_REPLY("fa-mail-reply"),
    MAIL_REPLY_ALL("fa-mail-reply-all"),
    MALE("fa-male"),
    MAP("fa-map"),
    MAP_MARKER("fa-map-marker"),
    MAP_O("fa-map-o"),
    MAP_PIN("fa-map-pin"),
    MAP_SIGNS("fa-map-signs"),
    MARS("fa-mars"),
    MARS_DOUBLE("fa-mars-double"),
    MARS_STROKE("fa-mars-stroke"),
    MARS_STROKE_H("fa-mars-stroke-h"),
    MARS_STROKE_V("fa-mars-stroke-v"),
    MAXCDN("fa-maxcdn"),
    MEANPATH("fa-meanpath"),
    MEDIUM("fa-medium"),
    MEDKIT("fa-medkit"),
    MEH_O("fa-meh-o"),
    MERCURY("fa-mercury"),
    MICROPHONE("fa-microphone"),
    MICROPHONE_SLASH("fa-microphone-slash"),
    MINUS("fa-minus"),
    MINUS_CIRCLE("syn-minus-circle"),
    MINUS_SQUARE("fa-minus-square"),
    MINUS_SQUARE_O("fa-minus-square-o"),
    MIXCLOUD("fa-mixcloud"),
    MOBILE("fa-mobile"),
    MOBILE_PHONE("fa-mobile-phone"),
    MODX("fa-modx"),
    MONEY("fa-money"),
    MOON_O("fa-moon-o"),
    MORTAR_BOARD("fa-mortar-board"),
    MOTORCYCLE("fa-motorcycle"),
    MOUSE_POINTER("fa-mouse-pointer"),
    MUSIC("fa-music"),
    NAVICON("fa-navicon"),
    NEUTER("fa-neuter"),
    NEWSPAPER_O("fa-newspaper-o"),
    OBJECT_GROUP("fa-object-group"),
    OBJECT_UNGROUP("fa-object-ungroup"),
    ODNOKLASSNIKI("fa-odnoklassniki"),
    ODNOKLASSNIKI_SQUARE("fa-odnoklassniki-square"),
    OPENCART("fa-opencart"),
    OPENID("fa-openid"),
    OPERA("fa-opera"),
    OPTIN_MONSTER("fa-optin-monster"),
    OUTDENT("fa-outdent"),
    PAGELINES("fa-pagelines"),
    PAINT_BRUSH("fa-paint-brush"),
    PAPERCLIP("fa-paperclip"),
    PAPER_PLANE("fa-paper-plane"),
    PAPER_PLANE_O("fa-paper-plane-o"),
    PARAGRAPH("fa-paragraph"),
    PASTE("fa-paste"),
    PAUSE("fa-pause"),
    PAUSE_CIRCLE("fa-pause-circle"),
    PAUSE_CIRCLE_O("fa-pause-circle-o"),
    PAW("fa-paw"),
    PAYPAL("fa-paypal"),
    PENCIL("fa-pencil"),
    PENCIL_SQUARE("fa-pencil-square"),
    PENCIL_SQUARE_O("fa-pencil-square-o"),
    PERCENT("fa-percent"),
    PHONE("fa-phone"),
    PHONE_SQUARE("fa-phone-square"),
    PHOTO("fa-photo"),
    PICTURE_O("fa-picture-o"),
    PIED_PIPER("fa-pied-piper"),
    PIED_PIPER_ALT("fa-pied-piper-alt"),
    PIED_PIPER_PP("fa-pied-piper-pp"),
    PIE_CHART("fa-pie-chart"),
    PINTEREST("fa-pinterest"),
    PINTEREST_P("fa-pinterest-p"),
    PINTEREST_SQUARE("fa-pinterest-square"),
    PLANE("fa-plane"),
    PLAY("fa-play"),
    PLAY_CIRCLE("fa-play-circle"),
    PLAY_CIRCLE_O("fa-play-circle-o"),
    PLUG("fa-plug"),
    PLUS("fa-plus"),
    PLUS_CIRCLE("fa-plus-circle"),
    PLUS_SQUARE("fa-plus-square"),
    PLUS_SQUARE_O("fa-plus-square-o"),
    POWER_OFF("fa-power-off"),
    PRINT("fa-print"),
    PRODUCT_HUNT("fa-product-hunt"),
    PUZZLE_PIECE("fa-puzzle-piece"),
    QQ("fa-qq"),
    QRCODE("fa-qrcode"),
    QUESTION("fa-question"),
    QUESTION_CIRCLE("syn-question-circle"),
    QUESTION_CIRCLE_O("fa-question-circle-o"),
    QUOTE_LEFT("fa-quote-left"),
    QUOTE_RIGHT("fa-quote-right"),
    RA("fa-ra"),
    RANDOM("fa-random"),
    REBEL("fa-rebel"),
    RECYCLE("fa-recycle"),
    REDDIT("fa-reddit"),
    REDDIT_ALIEN("fa-reddit-alien"),
    REDDIT_SQUARE("fa-reddit-square"),
    REFRESH("fa-refresh"),
    REGISTERED("fa-registered"),
    REMOVE("fa-remove"),
    RENREN("fa-renren"),
    REORDER("fa-reorder"),
    REPEAT("fa-repeat"),
    REPLY("fa-reply"),
    REPLY_ALL("fa-reply-all"),
    RESISTANCE("fa-resistance"),
    RETWEET("fa-retweet"),
    RMB("fa-rmb"),
    ROAD("fa-road"),
    ROCKET("fa-rocket"),
    ROTATE_LEFT("fa-rotate-left"),
    ROTATE_RIGHT("fa-rotate-right"),
    ROUBLE("fa-rouble"),
    RSS("fa-rss"),
    RSS_SQUARE("fa-rss-square"),
    RUB("fa-rub"),
    RUBLE("fa-ruble"),
    RUPEE("fa-rupee"),
    SAFARI("fa-safari"),
    SAVE("fa-save"),
    SCISSORS("fa-scissors"),
    SCRIBD("fa-scribd"),
    SEARCH("syn-search"),
    SEARCH_MINUS("fa-search-minus"),
    SEARCH_PLUS("fa-search-plus"),
    SELLSY("fa-sellsy"),
    SEND("fa-send"),
    SEND_O("fa-send-o"),
    SERVER("fa-server"),
    SHARE("fa-share"),
    SHARE_ALT("fa-share-alt"),
    SHARE_ALT_SQUARE("fa-share-alt-square"),
    SHARE_SQUARE("fa-share-square"),
    SHARE_SQUARE_O("fa-share-square-o"),
    SHEKEL("fa-shekel"),
    SHEQEL("fa-sheqel"),
    SHIELD("fa-shield"),
    SHIP("fa-ship"),
    SHIRTSINBULK("fa-shirtsinbulk"),
    SHOPPING_BAG("fa-shopping-bag"),
    SHOPPING_BASKET("fa-shopping-basket"),
    SHOPPING_CART("fa-shopping-cart"),
    SIGNAL("fa-signal"),
    SIGNING("fa-signing"),
    SIGN_IN("fa-sign-in"),
    SIGN_LANGUAGE("fa-sign-language"),
    SIGN_OUT("fa-sign-out"),
    SIMPLYBUILT("fa-simplybuilt"),
    SITEMAP("fa-sitemap"),
    SKYATLAS("fa-skyatlas"),
    SKYPE("fa-skype"),
    SLACK("fa-slack"),
    SLIDERS("fa-sliders"),
    SLIDESHARE("fa-slideshare"),
    SMILE_O("fa-smile-o"),
    SNAPCHAT("fa-snapchat"),
    SNAPCHAT_GHOST("fa-snapchat-ghost"),
    SNAPCHAT_SQUARE("fa-snapchat-square"),
    SOCCER_BALL_O("fa-soccer-ball-o"),
    SORT("syn-sort"),
    SORT_ALPHA_ASC("fa-sort-alpha-asc"),
    SORT_ALPHA_DESC("fa-sort-alpha-desc"),
    SORT_AMOUNT_ASC("fa-sort-amount-asc"),
    SORT_AMOUNT_DESC("fa-sort-amount-desc"),
    SORT_ASC("fa-sort-asc"),
    SORT_DESC("fa-sort-desc"),
    SORT_DOWN("fa-sort-down"),
    SORT_NUMERIC_ASC("fa-sort-numeric-asc"),
    SORT_NUMERIC_DESC("fa-sort-numeric-desc"),
    SORT_UP("fa-sort-up"),
    SOUNDCLOUD("fa-soundcloud"),
    SPACE_SHUTTLE("fa-space-shuttle"),
    SPINNER("fa-spinner"),
    SPOON("fa-spoon"),
    SPOTIFY("fa-spotify"),
    SQUARE("fa-square"),
    SQUARE_O("fa-square-o"),
    STACK_EXCHANGE("fa-stack-exchange"),
    STACK_OVERFLOW("fa-stack-overflow"),
    STAR("syn-star"),
    STAR_HALF("fa-star-half"),
    STAR_HALF_EMPTY("fa-star-half-empty"),
    STAR_HALF_FULL("fa-star-half-full"),
    STAR_HALF_O("fa-star-half-o"),
    STAR_O("syn-star-o"),
    STEAM("fa-steam"),
    STEAM_SQUARE("fa-steam-square"),
    STEP_BACKWARD("fa-step-backward"),
    STEP_FORWARD("fa-step-forward"),
    STETHOSCOPE("fa-stethoscope"),
    STICKY_NOTE("fa-sticky-note"),
    STICKY_NOTE_O("fa-sticky-note-o"),
    STOP("fa-stop"),
    STOP_CIRCLE("fa-stop-circle"),
    STOP_CIRCLE_O("fa-stop-circle-o"),
    STREET_VIEW("fa-street-view"),
    STRIKETHROUGH("fa-strikethrough"),
    STUMBLEUPON("fa-stumbleupon"),
    STUMBLEUPON_CIRCLE("fa-stumbleupon-circle"),
    SUBSCRIPT("fa-subscript"),
    SUBWAY("fa-subway"),
    SUITCASE("fa-suitcase"),
    SUN_O("fa-sun-o"),
    SUPERSCRIPT("fa-superscript"),
    SUPPORT("fa-support"),
    TABLE("fa-table"),
    TABLET("fa-tablet"),
    TACHOMETER("fa-tachometer"),
    TAG("fa-tag"),
    TAGS("fa-tags"),
    TASKS("fa-tasks"),
    TAXI("fa-taxi"),
    TELEVISION("fa-television"),
    TENCENT_WEIBO("fa-tencent-weibo"),
    TERMINAL("fa-terminal"),
    TEXT_HEIGHT("fa-text-height"),
    TEXT_WIDTH("fa-text-width"),
    TH("fa-th"),
    THEMEISLE("fa-themeisle"),
    THUMBS_DOWN("fa-thumbs-down"),
    THUMBS_O_DOWN("fa-thumbs-o-down"),
    THUMBS_O_UP("fa-thumbs-o-up"),
    THUMBS_UP("fa-thumbs-up"),
    THUMB_TACK("fa-thumb-tack"),
    TH_LARGE("fa-th-large"),
    TH_LIST("fa-th-list"),
    TICKET("fa-ticket"),
    TIMES("fa-times"),
    TIMES_CIRCLE("fa-times-circle"),
    TIMES_CIRCLE_O("fa-times-circle-o"),
    TINT("fa-tint"),
    TOGGLE_DOWN("fa-toggle-down"),
    TOGGLE_LEFT("fa-toggle-left"),
    TOGGLE_OFF("fa-toggle-off"),
    TOGGLE_ON("fa-toggle-on"),
    TOGGLE_RIGHT("fa-toggle-right"),
    TOGGLE_UP("fa-toggle-up"),
    TRADEMARK("fa-trademark"),
    TRAIN("fa-train"),
    TRANSGENDER("fa-transgender"),
    TRANSGENDER_ALT("fa-transgender-alt"),
    TRASH("fa-trash"),
    TRASH_O("syn-trash-o"),
    TREE("fa-tree"),
    TRELLO("fa-trello"),
    TRIPADVISOR("fa-tripadvisor"),
    TROPHY("fa-trophy"),
    TRUCK("fa-truck"),
    TRY("fa-try"),
    TTY("fa-tty"),
    TUMBLR("fa-tumblr"),
    TUMBLR_SQUARE("fa-tumblr-square"),
    TURKISH_LIRA("fa-turkish-lira"),
    TV("fa-tv"),
    TWITCH("fa-twitch"),
    TWITTER("fa-twitter"),
    TWITTER_SQUARE("fa-twitter-square"),
    UMBRELLA("fa-umbrella"),
    UNDERLINE("fa-underline"),
    UNDO("fa-undo"),
    UNIVERSAL_ACCESS("fa-universal-access"),
    UNIVERSITY("fa-university"),
    UNLINK("fa-unlink"),
    UNLOCK("fa-unlock"),
    UNLOCK_ALT("fa-unlock-alt"),
    UNSORTED("fa-unsorted"),
    UPLOAD("fa-upload"),
    USB("fa-usb"),
    USD("fa-usd"),
    USER("fa-user"),
    USERS("fa-users"),
    USER_MD("fa-user-md"),
    USER_PLUS("fa-user-plus"),
    USER_SECRET("fa-user-secret"),
    USER_TIMES("fa-user-times"),
    VENUS("fa-venus"),
    VENUS_DOUBLE("fa-venus-double"),
    VENUS_MARS("fa-venus-mars"),
    VIACOIN("fa-viacoin"),
    VIADEO("fa-viadeo"),
    VIADEO_SQUARE("fa-viadeo-square"),
    VIDEO_CAMERA("fa-video-camera"),
    VIMEO("fa-vimeo"),
    VIMEO_SQUARE("fa-vimeo-square"),
    VINE("fa-vine"),
    VK("fa-vk"),
    VOLUME_CONTROL_PHONE("fa-volume-control-phone"),
    VOLUME_DOWN("fa-volume-down"),
    VOLUME_OFF("fa-volume-off"),
    VOLUME_UP("fa-volume-up"),
    WARNING("syn-warning"),
    WECHAT("fa-wechat"),
    WEIBO("fa-weibo"),
    WEIXIN("fa-weixin"),
    WHATSAPP("fa-whatsapp"),
    WHEELCHAIR("fa-wheelchair"),
    WHEELCHAIR_ALT("fa-wheelchair-alt"),
    WIFI("fa-wifi"),
    WIKIPEDIA_W("fa-wikipedia-w"),
    WINDOWS("fa-windows"),
    WON("fa-won"),
    WORDPRESS("fa-wordpress"),
    WPBEGINNER("fa-wpbeginner"),
    WPFORMS("fa-wpforms"),
    WRENCH("fa-wrench"),
    XING("fa-xing"),
    XING_SQUARE("fa-xing-square"),
    YAHOO("fa-yahoo"),
    YC("fa-yc"),
    YC_SQUARE("fa-yc-square"),
    YELP("fa-yelp"),
    YEN("fa-yen"),
    YOAST("fa-yoast"),
    YOUTUBE("fa-youtube"),
    YOUTUBE_PLAY("fa-youtube-play"),
    YOUTUBE_SQUARE("fa-youtube-square"),
    Y_COMBINATOR("fa-y-combinator"),
    Y_COMBINATOR_SQUARE("fa-y-combinator-square"),
    _500PX("fa-500px")
    ;

    private final String cssClass;

    private IconType(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static IconType fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, IconType.class, null);
    }
}
