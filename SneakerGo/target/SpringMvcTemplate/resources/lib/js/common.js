/**
 * Created by Hung on 11/19/2016.
 */
/**
 * Scroll top for common ajax.
 */
var IS_SCROLL_TOP = true;
var CommonAjax = {
    request: function (url, requestMethod, data, isAsync, successCallbackFunc,
                       errorCallBackFunc, showLoading, $element, isProcessData, isContentType) {
        var isLoadingSymbol = typeof (showLoading) == 'undefined' ? true : showLoading;
        $element = typeof $element !== 'undefined' ? $element : $("body");
        var currentTitle = document.title;
        var loadingTitle = "処理中...";

        var processData = typeof isProcessData !== 'undefined' ? isProcessData : undefined;
        var contentType = typeof isContentType !== 'undefined' ? isContentType : undefined;

        if (currentTitle == loadingTitle) {
            currentTitle = "";
        }

        // Todo: Remove log
        console.log('URL: ' + url);

        // Loading symbol in middle of the screen.
        if (isLoadingSymbol) {
            $element.addClass("loading");
            document.title = loadingTitle;
        }

        CommonAjax.done(function () {
            $('#hidden-loading-focus').focus();
            // Process ajax call
            $.ajax({
                    url: contextPath + url,
                    async: isAsync,
                    type: requestMethod,
                    data: data,
                    processData: processData,
                    contentType: contentType,
                    success: function (returnedData, textStatus, jqXHR) {
                        // Turn off loading symbol
                        CommonAjax.hideLoadingSymbol(isLoadingSymbol, currentTitle);
                        successCallbackFunc(returnedData, jqXHR);
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        // Turn off loading symbol
                        CommonAjax.hideLoadingSymbol(isLoadingSymbol, currentTitle);

                        if (textStatus == "error" && jqXHR.status == 401 && errorThrown == "Unauthorized") {
                            window.location = contextPath + "/login";
                        } else if (jqXHR.status == 500) {
                            window.location = contextPath + "/500-error";
                        } else if (jqXHR.status == 403) {
                            window.location = contextPath + "/403-error";
                        } else if (jqXHR.status == 412) {
                            window.location = contextPath + "/412-error";
                        }
                        else {
                            errorCallBackFunc(jqXHR, textStatus, errorThrown);
                        }
                    }
                }
            )
        });
    },

    hideLoadingSymbol: function (isLoadingSymbol, currentTitle) {
        // Turn off loading symbol
        if (isLoadingSymbol) {
            $(".loading").removeClass("loading");

            if (!isNullOrEmptyStr(currentTitle)) {
                document.title = currentTitle;
            }

            if (IS_SCROLL_TOP) {
                $('body').animate({scrollTop: 0}, 'slow');
            }
        }
    },
};