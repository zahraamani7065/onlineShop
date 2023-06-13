package android.company.aronlineshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import android.company.aronlineshop.models.Product


val products = mutableListOf(
    Product(
        8, "مایکروفر", "3,000,000", R.drawable.oven_photo,
        "تحویل رایگان",
        "این محصول دارای تایمر پخت جهت تنظیم توان و زمان دلخواه قابلیت پخت سریع و یخ زدایی براساس وزن و زمان می باشد. همچنین امکان فعال سازی فن جهت بو زدایی و ذخیره سازی تنظیمات دلخواه را دارد",
        4.5f, "734",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/oven.glb?alt=media&token=116d796f-9619-45c2-b170-9704520c7582"
    ),
    Product(
        5, "صندلی طبی", "2,000,000", R.drawable.office_chair,
        "تحویل رایگان",
        "صندلی گیمینگ Verta Gear مدل KVX-2500 یکی از بهترین صندلی های زیبا و با کیفیت موجود در بازار ایران است و به شما این امکان را می دهد که ساعات طولانی را بدون نگرانی از خستگی و کوفتگی ناشی از نشستن، از انجام کار های خود لذت ببرید",
        4.5f, "257",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/chair.glb?alt=media&token=ca3b84fa-e8b2-4c85-bff1-1b0b63272c1e"
    ),
    Product(
        4, "پایه نگهدارنده موبایل", "100,000", R.drawable.tripod_image,
        "تحویل رایگان",
        "پایه نگهدارنده گوشی و تبلت Yesido Telescopic Holder ، هولدری زیبا با بدنه ای بسیار محکم و مقاوم است. بدنه ی این هولدر از پلاستیک با کیفیت ساخته شده است. این پایه دارای دو بازویی است که گوشی موبایل را نگه میدارد.",
        4f, "14,396",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/Tripod%20Grip.glb?alt=media&token=c8c8650f-8980-4848-ba46-130b7d90cc83"
    ),
    Product(
        2, "میز", "1,500,000", R.drawable.table,
        "تحویل رایگان",
        " این میز با طول 100 سانتیمتری و عرضی 55 سانتیمتری، ارتفاعی معادل 77 سانتیمتر دارد، که نوید یک میز تحریر استاندارد و جمع و جور را میدهد",
        4f, "895",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/canteenTable.glb?alt=media&token=c6d913d9-847c-4e4c-8907-51ccf0b56c96"
    ),
    Product(
        3, "پنکه", "3,200,000", R.drawable.pedestal_fan,
        "تحویل رایگان",
        ". بدنهی این دستگاه از پلاستیک ساخته شده و بهاینترتیب وزن آن تا حد امکان کم شده است. چهار پرهCی پلاستیکی شفاف پنکه وظیفهی گردش هوا را برعهده دارند. بهکمک میلهی تلسکوپی دستگاه میتوانید ارتفاع آن را بلند یا کوتاه کنید. با تنظیم ارتفاع پنکه میتوانید گردش هوا را با محیط خانه یا محل کار خود سازگار کنید. ارتفاع این پنکه از 100 تا 120 سانتیمتر قابلتغییر است.",
        3.5f, "4,752",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/coolerfan(without-defense).glb?alt=media&token=9ec989b7-82da-4892-b2b6-926fa7dd3f92"
    ),
    Product(
        6, "صندلی کروماتیک", "1,000,500", R.drawable.bar_chair,
        "تحویل رایگان",
        ". این نوع صندلی سبک و راحت، برای میز ناهارخوری، میز کار، کانتر و همچنین در پاسیو قابل استفاده است. در قسمت انتهایی هر یک از پایههای صندلی، از واشرهای پلاستیکی استفاده شده است تا علاوه بر آسیب نرساندن به کف، از نفوذ رطوبت و خیسی کف به پایههای چوبی صندلی نیز جلوگیری کنند",
        4f, "1,664",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/bar_chair.glb?alt=media&token=f17deee7-1bff-4ff0-86ea-9542f68146cb"
    ),
    Product(
        7, "نیمکت", "500,000", R.drawable.park_bench_photo,
        "تحویل رایگان",
        "\n" +
                "تماما چوب طبیعی نشیمن ۹۰ در ۳۰ به ضخامت ۵ سانتیمتر پایه ها جدا شونده",
        3.5f, "578",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/park_bench.glb?alt=media&token=8afb7436-7dc2-411e-9b9a-3583c076fc8f"
    ),

)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}