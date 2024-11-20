package com.dimartino.cryptotracker.crypto.presentation.coin_list

import com.dimartino.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}