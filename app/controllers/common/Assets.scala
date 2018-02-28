package controllers.common

import javax.inject.{Inject, Singleton}

import controllers.{AssetsBuilder, AssetsMetadata}
import play.api.http.HttpErrorHandler

@Singleton
class Assets @Inject() (errorHandler: HttpErrorHandler, assetsMetadata: AssetsMetadata) extends AssetsBuilder(errorHandler, assetsMetadata)