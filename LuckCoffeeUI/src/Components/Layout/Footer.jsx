import React from "react";

function Footer() {
    return (
        <>
            {/* Remove the container if you want to extend the Footer to full width. */}
            <div className="my-5">
                {/* Footer */}
                <footer
                    className="text-center text-lg-start text-white"
                    style={{ backgroundColor: "#1c2331" }}
                >
                    {/* Section: Social media */}
                    <section
                        className="d-flex justify-content-between p-4"
                        style={{ backgroundColor: "#f5ece5" , color: "#000"}}
                    >
                        {/* Left */}
                        <div className="me-5">
                            <span>Hãy kết nối với chúng tôi trên các mạng xã hội:</span>
                        </div>
                        {/* Left */}
                        {/* Right */}
                        <div>
                            <a href="" className="text-white me-4">
                                <i className="fa fa-facebook-f icon-black" />
                            </a>
                            <a href="" className="text-white me-4">
                                <i className="fa fa-twitter icon-black" />
                            </a>
                            <a href="" className="text-white me-4">
                                <i className="fa fa-instagram icon-black" />
                            </a>                          
                        </div>
                        {/* Right */}
                    </section>
                    {/* Section: Social media */}
                    {/* Section: Links  */}
                    <section className="">
                        <div className="container text-center text-md-start mt-5">
                            {/* Grid row */}
                            <div className="row mt-3">
                                {/* Grid column */}
                                <div className="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
                                    {/* Content */}
                                    <h6 className="text-uppercase fw-bold">Coffee Luck</h6>
                                    <hr
                                        className="mb-4 mt-0 d-inline-block mx-auto"
                                        style={{ width: 60, backgroundColor: "#7c4dff", height: 2 }}
                                    />
                                    <p>
                                        Cà phê không chỉ là thức uống mà còn là văn hóa, lối sống của người Việt. Những sáng tạo độc đáo như cà phê trứng, cà phê muối... đã chinh phục nhiều tín đồ ẩm thực thế giới.
                                    </p>
                                </div>


                                {/* Grid column */}
                                {/* Grid column */}
                                <div className="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
                                    {/* Links */}
                                    <h6 className="text-uppercase fw-bold">Liên hệ</h6>
                                    <hr
                                        className="mb-4 mt-0 d-inline-block mx-auto"
                                        style={{ width: 60, backgroundColor: "#7c4dff", height: 2 }}
                                    />
                                    <p>
                                        <i className="fa fa-home me-10" /> &nbsp;Số nhà 6, ngõ 204 đường Phú Diễn, Nam Từ Liêm, Hà Nội
                                    </p>
                                    <p>
                                        <i className="fa fa-envelope mr-3" /> &nbsp;evovodich@gmai.com
                                    </p>
                                    <p>
                                        <i className="fa fa-phone mr-3" /> &nbsp;0963751588
                                    </p>

                                </div>
                                {/* Grid column */}
                            </div>
                            {/* Grid row */}
                        </div>
                    </section>
                    {/* Section: Links  */}
                    {/* Copyright */}
                    <div
                        className="text-center p-3"
                        style={{ backgroundColor: "rgba(0, 0, 0, 0.2)" }}
                    >
                        © 2023 Copyright:
                        <a className="text-white" href="https://hunre.edu.vn/">
                        &nbsp; Coffee Luck
                        </a>
                    </div>
                    {/* Copyright */}
                </footer>
                {/* Footer */}
            </div>
        </>
    );
}

export default Footer;
