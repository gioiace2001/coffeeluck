import ImageGallery from "react-image-gallery";
import "react-image-gallery/styles/css/image-gallery.css";
import "../../style/slideshow.css"

const images = [
  {
    original: "/slide/slide-coffee-3.png",
  },
  {
    original: "/slide/slide-coffee-2.png",
  },
  {
    original: "/slide/slide-coffee-4.png",
  },
  {
    original: "/slide/slide-coffee-5.png",
  },
];


function Slideshow() {
  return (
    <div className="slideshow-container container my-1 ">
      <ImageGallery
        items={images}
        autoPlay={true}
        showPlayButton={false}
        showFullscreenButton={false}
        showBullets={true}
      />
    </div>
  )
}

export default Slideshow
