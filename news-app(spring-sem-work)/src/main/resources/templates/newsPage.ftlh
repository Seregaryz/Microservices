<#if isAuth == true>
    <#include "base-with-authorization.ftl"/>
<#else>
    <#include "base-non-authorized.ftl"/>
</#if>

<#macro title>post</#macro>

<#macro links>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="js/jquery-3.4.1.js"></script>
    <#import "spring.ftl" as spring />
    <style>
        .borderImg {
            border: 2px solid #000000;
        }

        a.profile-dropdown-toggle {
            color: white;
        }

        .container-post {
            margin-top: 30px;
            margin-bottom: 30px;
        }

        .card-post {
            padding: 16px;
        }

        .card-like-button-wrap {
            display: flex;
            justify-content: flex-end;
        }

        .card-like-button {
            margin-left: 12px;
            padding: 0;
            width: 30px;
            background: transparent;
            border: 0;
        }

        .card-like-icon {
            max-width: 24px;
            height: auto;
        }

        .media-author {
            padding: 16px 0;
        }

        .media-author-photo {
            max-width: 80px;
        }

        .media-author-body {
            color: black;
            font-size: small;
        }

        .card-text {
            color: black;
            font-size: 14px;
        }

        .card a:hover {
            text-decoration: none;
        }
    </style>
    <link rel="stylesheet" href="css/extra-styles.css">
</#macro>

<#macro content>
    <head>
        <meta charset="UTF-8">
        <@links/>
    </head>
    <body>
    <div class="container">
        <div class="row">
            <div class="col">
            </div>
            <div class="col-12">
                <div class="row justify-content-center">
                    <div class="col">
                        <div class="card card-post mt-3">
                            <div class="media media-author">
                                <div class="media-body media-author-body">
                                    <h5 class="mt-1 text-center mb-4">${news.getHeader()}</h5>
                                    <img src="${news.getPhotoPath()}" class="w-100">
                                    <p class="text-center mt-2 font-18px">${news.getCreatedAt()}</p>
                                    <p class="my-3 font-18px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${news.getText()}</p>
                                </div>
                            </div>
                        </div>
                        <div>
                            <form action="/signIn" method="get">
                                <div class="form-group my-3">
                                    <label for="comment"><@spring.message 'news_page.add_comment'/></label>
                                    <textarea class="form-control" id="comment" rows="3"
                                              name="text" placeholder="<@spring.message 'news_page.comment_placeholder'/>"></textarea>
                                    <input name="id" value="${news.getId()}" type="hidden">
                                </div>
                                <input type="submit" class="btn btn-dark float-right my-3" value="<@spring.message  'add_post.add_publish'/>">
                            </form>
                            <p class="mt-5"><@spring.message 'news_page.commentaries'/></p>
                            <#--                            <#list comments as c>-->
                            <#--                                <div class="card-body border border-dark my-3">-->
                            <#--                                    <li class="media my-4">-->
                            <#--                                        <ul class="list-unstyled">-->
                            <#--                                            <li class="media">-->
                            <#--                                                <img src="${c.getSender().getPhotoPath()}" alt="avatar"-->
                            <#--                                                     class="mr-3 img-fluid media-author-photo img-circle"-->
                            <#--                                                     style="width: 50px; height: 50px;">-->
                            <#--                                                <div class="media-body">-->
                            <#--                                                    <form action="/profileOfUser" method="get">-->
                            <#--                                                        <input name="id" value="${c.getSender().getId()}" type="hidden">-->
                            <#--                                                        <button type="submit" class="btn btn-link text-dark">-->
                            <#--                                                            <p class="mt-0 mb-1">${c.getSender().getNickname()}</p>-->
                            <#--                                                        </button>-->
                            <#--                                                    </form>-->
                            <#--                                                    <p>${c.getText()}</p>-->
                            <#--                                                    <p class="comment-date">-->
                            <#--                                                        <small>${c.getStringDate()}</small>-->
                            <#--                                                    </p>-->
                            <#--                                                </div>-->
                            <#--                                            </li>-->
                            <#--                                        </ul>-->
                            <#--                                    </li>-->
                            <#--                                </div>-->
                            <#--                            </#list>-->

                        </div>
                    </div>
                </div>
            </div>
            <div class="col">
            </div>
        </div>
    </div>
    </body>
</#macro>

<@main/>
